package disconf.mybatis.entity;

/**
 * @author 
 */
public class User {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * token
     */
    private String token;

    /**
     * 能操作的APPID,逗号分隔
     */
    private String ownapps;

    /**
     * 角色ID
     */
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOwnapps() {
        return ownapps;
    }

    public void setOwnapps(String ownapps) {
        this.ownapps = ownapps;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", token=").append(token);
        sb.append(", ownapps=").append(ownapps);
        sb.append(", roleId=").append(roleId);
        sb.append("]");
        return sb.toString();
    }
}