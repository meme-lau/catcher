package ml.memelau.catcher.server.model;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table app_group_member
 */
public class AppGroupMember implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group_member.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group_member.group_id
     *
     * @mbg.generated
     */
    private Integer groupId;

    /**
     * Database Column Remarks:
     *   成员名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group_member.member_name
     *
     * @mbg.generated
     */
    private String memberName;

    /**
     * Database Column Remarks:
     *   是否为管理员
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_group_member.group_master
     *
     * @mbg.generated
     */
    private Boolean groupMaster;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table app_group_member
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group_member.id
     *
     * @return the value of app_group_member.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group_member
     *
     * @mbg.generated
     */
    public AppGroupMember withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group_member.id
     *
     * @param id the value for app_group_member.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group_member.group_id
     *
     * @return the value of app_group_member.group_id
     *
     * @mbg.generated
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group_member
     *
     * @mbg.generated
     */
    public AppGroupMember withGroupId(Integer groupId) {
        this.setGroupId(groupId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group_member.group_id
     *
     * @param groupId the value for app_group_member.group_id
     *
     * @mbg.generated
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group_member.member_name
     *
     * @return the value of app_group_member.member_name
     *
     * @mbg.generated
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group_member
     *
     * @mbg.generated
     */
    public AppGroupMember withMemberName(String memberName) {
        this.setMemberName(memberName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group_member.member_name
     *
     * @param memberName the value for app_group_member.member_name
     *
     * @mbg.generated
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_group_member.group_master
     *
     * @return the value of app_group_member.group_master
     *
     * @mbg.generated
     */
    public Boolean getGroupMaster() {
        return groupMaster;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group_member
     *
     * @mbg.generated
     */
    public AppGroupMember withGroupMaster(Boolean groupMaster) {
        this.setGroupMaster(groupMaster);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_group_member.group_master
     *
     * @param groupMaster the value for app_group_member.group_master
     *
     * @mbg.generated
     */
    public void setGroupMaster(Boolean groupMaster) {
        this.groupMaster = groupMaster;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group_member
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
        AppGroupMember other = (AppGroupMember) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getGroupMaster() == null ? other.getGroupMaster() == null : this.getGroupMaster().equals(other.getGroupMaster()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group_member
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getGroupMaster() == null) ? 0 : getGroupMaster().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table app_group_member
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
        sb.append(", groupId=").append(groupId);
        sb.append(", memberName=").append(memberName);
        sb.append(", groupMaster=").append(groupMaster);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}