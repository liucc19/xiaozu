import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * @program: java-file
 * @description:
 * @author: yzgui
 * @create: 2021-11-16 20:54
 **/
public class FileOperator {
    /**
     * 判断文件是否存在
     * @param pathname 文件路径
     * @return 判断结果
     */
    public static boolean isExist(String pathname) {
        File file = new File(pathname);
        return file.exists();
    }

    /**
     * 创建目录
     * @param pathname 目录路径
     * @return 创建结果
     */
    public static boolean createDir(String pathname) {
        File file = new File(pathname);
        if (!file.exists()) {
            return file.mkdirs();
        }
        return false;
    }

    /**
     * 创建文件
     * @param pathname 文件路径
     * @return 创建结果
     * @throws IOException IO
     */
    public static boolean createFile(String pathname) throws IOException {
        File file = new File(pathname);
        if (!file.exists()) {
            return file.createNewFile();
        }
        return false;
    }

    /**
     * 获取文件信息
     * @param file file对象
     * @return 文件信息Properties对象
     */
    public static Properties getFileInfo(File file) {
        String fileName = file.getName();
        String filePath = file.getPath();
        String parentDir = file.getParent();
        long fileLength = file.length();
        Properties properties = new Properties();
        properties.setProperty("fileName",fileName);
        properties.setProperty("filePath",filePath);
        properties.setProperty("parentDir",parentDir);
        properties.setProperty("fileLength",String.valueOf(fileLength));
        return properties;
    }

    public static boolean deleteFile(String pathname) {
        File file = new File(pathname);
        if (file.exists()) {
            return file.delete();
        }
        return false;
    }
}
