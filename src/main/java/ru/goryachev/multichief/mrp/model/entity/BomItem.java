package ru.goryachev.multichief.mrp.model.entity;

import ru.goryachev.multichief.mrp.model.keys.BomItemCompositeKey;

import javax.persistence.*;

/**
 * BomItem - Item position of material (in the bill), has composite key.
 * @author Lev Goryachev
 * @version 1.1
 */

@Entity
@Table(name = "bom_item")
@IdClass(BomItemCompositeKey.class)
public class BomItem {

    @Id
    @Column (name = "bom_id")
    private Long bomId;

    @Id
    @Column (name = "material_id")
    private Long materialId;

    @Column(name = "bom_qty")
    private Integer bomQty;

    public Long getBomId() {
        return bomId;
    }

    public void setBomId(Long bomId) {
        this.bomId = bomId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public Integer getBomQty() {
        return bomQty;
    }

    public void setBomQty(Integer bomQty) {
        this.bomQty = bomQty;
    }
}
