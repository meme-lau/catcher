package ml.memelau.catcher.server.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table error_event_count
 */
public class ErrorEventCount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column error_event_count.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column error_event_count.event_id
     *
     * @mbg.generated
     */
    private Integer eventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column error_event_count.occurred_time
     *
     * @mbg.generated
     */
    private Date occurredTime;

    /**
     * Database Column Remarks:
     *   错误事件附加信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column error_event_count.additions
     *
     * @mbg.generated
     */
    private String additions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table error_event_count
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column error_event_count.id
     *
     * @return the value of error_event_count.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_count
     *
     * @mbg.generated
     */
    public ErrorEventCount withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column error_event_count.id
     *
     * @param id the value for error_event_count.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column error_event_count.event_id
     *
     * @return the value of error_event_count.event_id
     *
     * @mbg.generated
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_count
     *
     * @mbg.generated
     */
    public ErrorEventCount withEventId(Integer eventId) {
        this.setEventId(eventId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column error_event_count.event_id
     *
     * @param eventId the value for error_event_count.event_id
     *
     * @mbg.generated
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column error_event_count.occurred_time
     *
     * @return the value of error_event_count.occurred_time
     *
     * @mbg.generated
     */
    public Date getOccurredTime() {
        return occurredTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_count
     *
     * @mbg.generated
     */
    public ErrorEventCount withOccurredTime(Date occurredTime) {
        this.setOccurredTime(occurredTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column error_event_count.occurred_time
     *
     * @param occurredTime the value for error_event_count.occurred_time
     *
     * @mbg.generated
     */
    public void setOccurredTime(Date occurredTime) {
        this.occurredTime = occurredTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column error_event_count.additions
     *
     * @return the value of error_event_count.additions
     *
     * @mbg.generated
     */
    public String getAdditions() {
        return additions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_count
     *
     * @mbg.generated
     */
    public ErrorEventCount withAdditions(String additions) {
        this.setAdditions(additions);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column error_event_count.additions
     *
     * @param additions the value for error_event_count.additions
     *
     * @mbg.generated
     */
    public void setAdditions(String additions) {
        this.additions = additions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_count
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
        ErrorEventCount other = (ErrorEventCount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getEventId() == null ? other.getEventId() == null : this.getEventId().equals(other.getEventId()))
            && (this.getOccurredTime() == null ? other.getOccurredTime() == null : this.getOccurredTime().equals(other.getOccurredTime()))
            && (this.getAdditions() == null ? other.getAdditions() == null : this.getAdditions().equals(other.getAdditions()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_count
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getEventId() == null) ? 0 : getEventId().hashCode());
        result = prime * result + ((getOccurredTime() == null) ? 0 : getOccurredTime().hashCode());
        result = prime * result + ((getAdditions() == null) ? 0 : getAdditions().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_count
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
        sb.append(", eventId=").append(eventId);
        sb.append(", occurredTime=").append(occurredTime);
        sb.append(", additions=").append(additions);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}