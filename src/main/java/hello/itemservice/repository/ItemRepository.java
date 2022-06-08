package hello.itemservice.repository;

import hello.itemservice.domain.Item;

import java.util.List;
import java.util.Optional;

public interface ItemRepository {

    Item save(Item item);

    void update(Long itemId, ItemUpdateDto updateParam); // ItemRepository가 Dto를 처음으로 만든거다. 그래서 Service 패키지가 아닌
    // 같은 리포지토리 안에  Dto를 두는것이 맞다 . 그러나 서비스에서만 쓰이는 Dto면 서비스 패키지 안에 두는것이 맞다.
    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond cond);

}
