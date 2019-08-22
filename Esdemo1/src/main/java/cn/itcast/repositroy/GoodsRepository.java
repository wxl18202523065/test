package cn.itcast.repositroy;

import cn.itcast.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @创建人 wangxueliang
 * @创建时间 2019/8/19
 * @描述
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods,Long> {
    List<Goods> findByTitle(String title);

    List<Goods> findByPriceBetween(double low, double high);

    List<Goods> findByTitleAndPriceBetween(String title, double low, double high);

    List<Goods> findByTitleOrPriceBetween(String title,double low, double high);
}

