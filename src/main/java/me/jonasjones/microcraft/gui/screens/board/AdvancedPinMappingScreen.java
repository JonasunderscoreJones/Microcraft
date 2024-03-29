package me.jonasjones.microcraft.gui.screens.board;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

public class AdvancedPinMappingScreen extends Screen {

    private final Screen parent;

    public AdvancedPinMappingScreen(Screen parent) {
        super(Text.of("Advanced Pin Mapping"));
        this.parent = parent;
    }

    protected void init() {
    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, this.title, this.width / 2, 15, 16777215);
        super.render(matrices, mouseX, mouseY, delta);
    }
}
