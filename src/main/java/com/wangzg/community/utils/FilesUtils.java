package com.wangzg.community.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @Auther: wangzg
 * @Date: 2022-3-19 14:40
 * @Description:
 */
public class FilesUtils {

    /**
     * 将文件保存到指定路径
     *
     * @return
     */
    public static String save(MultipartFile file, String path,String newName) {

        // 验证文件是不是传了
        if (file.getSize() <= 0) {
            return null;
        }

        // 验证文件夹是否存在
        File pathFile = new File(path);
        if (!pathFile.exists()) {
            // 创建
            if (!pathFile.mkdirs()) {
                return null;
            }
        }

        // 创建一个文件流
        try (OutputStream out = new FileOutputStream(path + "\\" + newName)) {
            // 把上传的文件,写到这个流里面
            out.write(file.getBytes());

            // 写成功了
            return newName;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return null;
    }

}
