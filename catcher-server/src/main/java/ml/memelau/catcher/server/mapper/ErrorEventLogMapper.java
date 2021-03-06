package ml.memelau.catcher.server.mapper;

import java.util.List;
import ml.memelau.catcher.server.model.ErrorEventLog;
import ml.memelau.catcher.server.model.ErrorEventLogExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ErrorEventLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    long countByExample(ErrorEventLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    int insert(ErrorEventLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    int insertSelective(ErrorEventLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    List<ErrorEventLog> selectByExampleWithBLOBsWithRowbounds(ErrorEventLogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    List<ErrorEventLog> selectByExampleWithBLOBs(ErrorEventLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    List<ErrorEventLog> selectByExampleWithRowbounds(ErrorEventLogExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    List<ErrorEventLog> selectByExample(ErrorEventLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    ErrorEventLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ErrorEventLog record, @Param("example") ErrorEventLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") ErrorEventLog record, @Param("example") ErrorEventLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ErrorEventLog record, @Param("example") ErrorEventLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ErrorEventLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(ErrorEventLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table error_event_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ErrorEventLog record);
}