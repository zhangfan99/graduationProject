package easybuild.core.utils;

import java.util.UUID;

/**
 * Created by zhangfan on 2017/1/20.
 */
public class UUIDGenerator {

    /**
     * 生成长度为32个字符的uuid
     * @return
     */
    public static String generateUUID() {
        String uuid = UUID.randomUUID().toString().trim();
        uuid = uuid.replaceAll("-", "");

        return uuid;
    }
}
