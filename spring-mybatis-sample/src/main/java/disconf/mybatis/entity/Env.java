package disconf.mybatis.entity;

/**
 * @author 
 */
public class Env {
    /**
     * 环境ID（主键，自增长）
     */
    private Long envId;

    /**
     * 环境名字
     */
    private String name;

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", envId=").append(envId);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}