package caffein.momineko.core.Classes;

import caffein.momineko.core.Status.CaffeinStatus;
import caffein.momineko.core.Status.CaffeinStatusContainer;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static caffein.momineko.core.Generic.ExceptionMaterial;

public class CaffeinClassContainer implements CaffeinClass {

    private Material material = ExceptionMaterial;
    private String display;
    private List<String> lore;
    private int level;
    private int exp;
    private final CaffeinStatusContainer caffeinStatus;
    private final CaffeinStatus increaseStatus;

    CaffeinClassContainer() {
        caffeinStatus = CaffeinStatus.create();
        increaseStatus = CaffeinStatus.create();
    }

    @Override
    public void setMaterial(@Nullable Material material) {
        this.material = material != null ? material : this.material;
    }

    @Override
    public Material getMaterial() {
        return material;
    }

    @Override
    public CaffeinStatusContainer getCaffeinStatusContainer() {
        return caffeinStatus;
    }

    @Override
    public CaffeinStatus getIncreaseStatus() {
        return increaseStatus;
    }

    @Override
    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void setLore(List<String> lore) {
        this.lore = lore;
    }

    @Override
    public List<String> getLore() {
        return lore;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void addLevel(int level) {
        this.level += level;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void addExp(int exp) {
        this.exp += exp;
    }

    @Override
    public int getExp() {
        return exp;
    }

    @Override
    public ItemStack toItemStack() {
        ItemStack item = new ItemStack(getMaterial(), 1);
        ItemMeta meta = item.getItemMeta();

        return null;
    }
}
