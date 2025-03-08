package shandong.zheng.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import shandong.zheng.springboot.common.enums.ResponseEnum;
import shandong.zheng.springboot.common.response.ServiceResponse;
import shandong.zheng.springboot.entity.Order;
import shandong.zheng.springboot.service.OrderService;

import javax.annotation.Resource;

/**
 * @author zhangzheng481@163.com
 * @since 2025/3/7 11:28
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private final static Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Resource
    private OrderService orderService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ServiceResponse<Void> add(@RequestBody Order order) {
        logger.info("add order request:{}", order);
        ServiceResponse<Void> response = new ServiceResponse<>(ResponseEnum.SUCCESS);
        try {
            //调用业务系统
            orderService.add(order);

        } catch (Exception e) {
            logger.error("add order err",e);
            response = new ServiceResponse<>(ResponseEnum.FAIL, e);
        }
        return response;
    }
}
