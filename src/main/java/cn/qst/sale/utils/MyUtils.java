package cn.qst.sale.utils;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author jiangheng
 * @date 2019/10/6 11:37
 * @description  各种工具类
 */
public class MyUtils {
    /**
     *
     * @param file_adminImg 要上传的文件
     * @param adminInfoBean 管理员信息
     * @param serverFileSavePath 服务地的保存的地址
     * @param fileNamePrefix  保存文件名的前缀
     */
    public static void uploadSingleFile(MultipartFile file_adminImg, Object adminInfoBean, String serverFileSavePath, String fileNamePrefix) {
        // springmvc将form表单中的file控件的流文件内容映射到 MultipartFile 形参变量file_adminImg上

        // 如果没有上传文件信息则不进行处理
        if (file_adminImg == null || file_adminImg.getSize() == 0) {
            // 没有进行文件上传，不做任何处理
        } else {

            // 将文件对象file_userimg 中的文件流上传到服务器
            // 获取文件的服务器的保存路径
            System.out.println("basepath:" + System.getProperty("server.basePath"));
            // 当前项目在web服务器上的部署的绝对路径：例如：G:/IDEAplace/salemanagement/target/classes/
            //String serverBasePath = System.getProperty("server.basePath");
            String serverBasePath = "";
            try {
                serverBasePath = ResourceUtils.getURL(ResourceUtils.CLASSPATH_URL_PREFIX).getPath();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println("baseeeeeeeeeeeeee:::::" + serverBasePath);
            // 设置服务器的保存文件的路径名
            // 完整的服务器保存路径为 serverBasePath+ serverFileSavePath
            // 将文件上传至static目录下
            String serverSavePath = serverBasePath + "static" + File.separator + serverFileSavePath;
            //String serverSavePath = serverBasePath + serverFileSavePath;
            // 验证服务器是否已经创建了该目录
            File fileSave = new File(serverSavePath);
            // 判断保存路径文件对象是否存在
            if (!fileSave.exists()) {
                // 创建该目录
                fileSave.mkdirs();
            }


            // 文件需要在服务器上进行重命名，然后进行保存
            // 获取文件类型
            String fileContentType = file_adminImg.getContentType();
            // 获取文件后缀
            String fileType = fileContentType.substring(fileContentType.indexOf("/") + 1);

            // 生成新的文件名
            String fileNewName = fileNamePrefix + System.currentTimeMillis() + "." + fileType;
            System.out.println("新文件名：" + fileNewName);

            // 将文件流写出到服务器保存路径
            try {
                file_adminImg.transferTo(new File(serverSavePath + fileNewName));
            } catch (IOException e) {
                System.out.println("文件上传异常：" + e.getMessage());
                e.printStackTrace();
            }


            // 需要保存的文件的访问路径
            String fileRelativePath = serverFileSavePath + fileNewName;
            System.out.println("文件的访问路径：" + fileRelativePath);
            // 将文件对象的访问路径映射给实体类对象的成员属性上

            // 提取需要保存的属性名
            String propertyName = file_adminImg.getName().replace("file_", "");
            try {

                BeanUtils.setProperty(adminInfoBean, propertyName, fileRelativePath);
            } catch (Exception e) {
                System.out.println("文件上传异常：" + e.getMessage());
                e.printStackTrace();
            }
        }
    }

}
