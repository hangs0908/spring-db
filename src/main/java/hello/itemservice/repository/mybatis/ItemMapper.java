package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper // 마이바티스 매핑 XML을 호출해주는 매퍼 인터페이스다.
public interface ItemMapper {

    void save(Item item);

    void update(@Param("id") Long id, @Param("updateParam")ItemUpdateDto updateParam); // 파라미터가 2개인경우는 @Param을 넣어줘야한다.

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond itemSearch);
}
