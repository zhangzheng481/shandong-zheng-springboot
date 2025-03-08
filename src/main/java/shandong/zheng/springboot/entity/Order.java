package shandong.zheng.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author zhangzheng481@163.com
 * @since 2025/3/6 21:09
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    /**
     * 分布式主键（禁止自增）
     */
    private Long id;

    /**
     * 订单编号（业务唯一标识）
     */
    private String orderNo;

    /**
     * 用户ID（分片键）
     */
    private Integer userId;

    /**
     * 订单金额（精确到分）
     */
    private BigDecimal amount;

    /**
     * 创建时间（数据库自动生成）
     */
    private LocalDateTime createTime;
}
