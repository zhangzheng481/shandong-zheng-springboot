package shandong.zheng.springboot.common.utils;

import com.dangdang.ddframe.rdb.sharding.id.generator.self.IPIdGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

/**
 * @author zhangzheng481@163.com
 * @since 2025/3/7 15:12
 */
@Component
public class KeyGenerator {
    private final static Logger logger = LoggerFactory.getLogger(KeyGenerator.class);
    private static String ip = "未知";
    private IPIdGenerator ipIdGenerator = new IPIdGenerator();

    static {
        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            logger.error("获取本机IP失败", e);
        }
    }

    //redis

    //雪花算法
    public long getLongId(){
        long id = ipIdGenerator.generateId().longValue();
        logger.info("机器IP:{},生成全局唯一long-ID：{}", ip, id);
        return id;
    }

}
