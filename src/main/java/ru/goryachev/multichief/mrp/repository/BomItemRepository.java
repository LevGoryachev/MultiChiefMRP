package ru.goryachev.multichief.mrp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.goryachev.multichief.mrp.model.dto.projection.ItemView;
import ru.goryachev.multichief.mrp.model.entity.BomItem;

import java.util.List;

@Repository
public interface BomItemRepository extends JpaRepository <BomItem, Long> {

   void deleteByBomIdAndMaterialId(Long bom_id, Long material_id);

   List<ItemView> findByBomId(Long bomId); //DTO projection materials with quantities

}
