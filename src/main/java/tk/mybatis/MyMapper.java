package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * @Author Harry
 * @ClassName MyMapper
 * @Description TODO:(一句话描述这个类)
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}

