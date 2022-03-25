package caffein.momineko.core.Classes;

import caffein.momineko.core.Loader.ConfigCaffeinLoader;
import caffein.momineko.core.Status.CaffeinStatus;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface CaffeinClass extends CaffeinStatus {

    static CaffeinClass create() {
        return new CaffeinClassContainer();
    }

    static int ReqExp(int level) {
        String formula = ConfigCaffeinLoader.ClassReqExpFormula;
        Expression expr = new ExpressionBuilder(formula.replace("lvl", String.valueOf(level))).build();
        double result = expr.evaluate();
        return (int) Math.ceil(result);
    }

    void setMaterial(@Nullable Material material);

    Material getMaterial();

    CaffeinStatus getIncreaseStatus();

    void setDisplay(String display);

    String getDisplay();

    void setLore(List<String> lore);

    List<String> getLore();

    void setLevel(int level);

    void addLevel(int level);

    int getLevel();

    void addExp(int exp);

    int getExp();

    ItemStack toItemStack();
}
