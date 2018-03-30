package disconf.mybatis.entity;

/**
 * @author 
 */
public class App {
    /**
     * 唯一的ID（没有啥意义，主键，自增长而已）
     */
    private Long appId;

    /**
     * APP名(一般是产品线+服务名)
     */
    private String name;

    /**
     * 介绍
     */
    private String description;

    /**
     * 生成时间
     */
    private String createTime;

    /**
     * 修改时
     */
    private String updateTime;

    /**
     * 邮箱列表逗号分隔
     */
    private String emails;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getEmails() {
        return emails;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", appId=").append(appId);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", emails=").append(emails);
        sb.append("]");
        return sb.toString();
    }
}