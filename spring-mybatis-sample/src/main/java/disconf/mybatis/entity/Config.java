package disconf.mybatis.entity;

/**
 * @author 
 */
public class Config {
    /**
     * 唯一的ID（没有啥意义，主键，自增长而已）
     */
    private Long configId;

    /**
     * 配置文件/配置项
     */
    private Short type;

    /**
     * 状态：1是正常 0是删除
     */
    private Short status;

    /**
     * 配置文件名/配置项KeY名
     */
    private String name;

    /**
     * 0 配置文件：文件的内容，1 配置项：配置值
     */
    private String value;

    /**
     * appid
     */
    private Long appId;

    /**
     * 版本
     */
    private String version;

    /**
     * envid
     */
    private Long envId;

    /**
     * 生成时间
     */
    private String createTime;

    /**
     * 修改时间
     */
    private String updateTime;

    public Long getConfigId() {
        return configId;
    }

    public void setConfigId(Long configId) {
        this.configId = configId;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", configId=").append(configId);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", name=").append(name);
        sb.append(", value=").append(value);
        sb.append(", appId=").append(appId);
        sb.append(", version=").append(version);
        sb.append(", envId=").append(envId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}