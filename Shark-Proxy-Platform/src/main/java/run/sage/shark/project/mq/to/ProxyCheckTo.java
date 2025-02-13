package run.sage.shark.project.mq.to;

import lombok.Data;

import java.io.Serializable;

/**
 * 代理检查TO
 *
 * @author Sage
 * @date 2023/02/06
 */
@Data
public class ProxyCheckTo implements Serializable {

    /**
     * IP
     */
    private String ip;

    /**
     * 端口
     */
    private String port;

    /**
     * 类型 (1 = http 2 = https 3 = socks4 4 = socks5)
     */
    private Integer type;

    /**
     * 是否首次检测
     */
    private Boolean firstCheck;

}
