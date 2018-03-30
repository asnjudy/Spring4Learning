package disconf.mybatis.entity;

/**
 * @author 
 */
public class RoleResource {
    /**
     * role-resource id
     */
    private Long roleResId;

    /**
     * 用户角色id
     */
    private Integer roleId;

    /**
     * controller_requestMapping_value + method_requestMapping_value
     */
    private String urlPattern;

    /**
     * url功能描述
     */
    private String urlDescription;

    /**
     * GET, PUT, POST, DELETE, 1: accessible
     */
    private String methodMask;

    /**
     * 更新时间
     */
    private String updateTime;

    public Long getRoleResId() {
        return roleResId;
    }

    public void setRoleResId(Long roleResId) {
        this.roleResId = roleResId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getUrlDescription() {
        return urlDescription;
    }

    public void setUrlDescription(String urlDescription) {
        this.urlDescription = urlDescription;
    }

    public String getMethodMask() {
        return methodMask;
    }

    public void setMethodMask(String methodMask) {
        this.methodMask = methodMask;
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
        sb.append(", roleResId=").append(roleResId);
        sb.append(", roleId=").append(roleId);
        sb.append(", urlPattern=").append(urlPattern);
        sb.append(", urlDescription=").append(urlDescription);
        sb.append(", methodMask=").append(methodMask);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}