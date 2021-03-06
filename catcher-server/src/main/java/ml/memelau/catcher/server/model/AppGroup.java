package ml.memelau.catcher.server.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table app_group
 */
public class AppGroup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group.access_key
     *
     * @mbg.generated
     */
    private String accessKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   项目组名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group.group_name
     *
     * @mbg.generated
     */
    private String groupName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   是否删除
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group.deleted
     *
     * @mbg.generated
     */
    private Boolean deleted;

    /**
     * Database Column Remarks:
     *   规则配置
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group.rule
     *
     * @mbg.generated
     */
    private String rule;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_group
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group.id
     *
     * @return the value of app_group.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    public AppGroup withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group.id
     *
     * @param id the value for app_group.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group.access_key
     *
     * @return the value of app_group.access_key
     *
     * @mbg.generated
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    public AppGroup withAccessKey(String accessKey) {
        this.setAccessKey(accessKey);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group.access_key
     *
     * @param accessKey the value for app_group.access_key
     *
     * @mbg.generated
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group.create_time
     *
     * @return the value of app_group.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    public AppGroup withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group.create_time
     *
     * @param createTime the value for app_group.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group.group_name
     *
     * @return the value of app_group.group_name
     *
     * @mbg.generated
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    public AppGroup withGroupName(String groupName) {
        this.setGroupName(groupName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group.group_name
     *
     * @param groupName the value for app_group.group_name
     *
     * @mbg.generated
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group.update_time
     *
     * @return the value of app_group.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    public AppGroup withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group.update_time
     *
     * @param updateTime the value for app_group.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group.deleted
     *
     * @return the value of app_group.deleted
     *
     * @mbg.generated
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    public AppGroup withDeleted(Boolean deleted) {
        this.setDeleted(deleted);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group.deleted
     *
     * @param deleted the value for app_group.deleted
     *
     * @mbg.generated
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group.rule
     *
     * @return the value of app_group.rule
     *
     * @mbg.generated
     */
    public String getRule() {
        return rule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    public AppGroup withRule(String rule) {
        this.setRule(rule);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group.rule
     *
     * @param rule the value for app_group.rule
     *
     * @mbg.generated
     */
    public void setRule(String rule) {
        this.rule = rule;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AppGroup other = (AppGroup) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccessKey() == null ? other.getAccessKey() == null : this.getAccessKey().equals(other.getAccessKey()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getDeleted() == null ? other.getDeleted() == null : this.getDeleted().equals(other.getDeleted()))
            && (this.getRule() == null ? other.getRule() == null : this.getRule().equals(other.getRule()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccessKey() == null) ? 0 : getAccessKey().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        result = prime * result + ((getRule() == null) ? 0 : getRule().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accessKey=").append(accessKey);
        sb.append(", createTime=").append(createTime);
        sb.append(", groupName=").append(groupName);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deleted=").append(deleted);
        sb.append(", rule=").append(rule);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}