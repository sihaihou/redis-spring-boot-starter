package com.reyco.redis.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * 在使用Spring官方的Starter时通常可以在application.properties中来配置参数覆盖掉默认的值，
 *  例如在使用redis时一般就会有对应的RedisProperties
 * @author Admin
 *
 */
@ConfigurationProperties(prefix="redis")
public class RedisProperties {
	
	private String host = "127.0.0.1";
	private Integer port = 6379;
	private String password = "";
	private Config config = new Config();
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Config getConfig() {
		return config;
	}
	public void setConfig(Config config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "RedisProperties [host=" + host + ", port=" + port + ", password=" + password + ", config=" + config
				+ "]";
	}
}
