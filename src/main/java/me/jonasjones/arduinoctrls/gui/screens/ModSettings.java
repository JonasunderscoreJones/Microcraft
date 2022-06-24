package me.jonasjones.arduinoctrls.gui.screens;

import me.jonasjones.arduinoctrls.gui.SelectDevice;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.SoundOptionsScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.screen.ScreenTexts;
import net.minecraft.text.Text;


@Environment(EnvType.CLIENT)
public class ModSettings extends Screen {
    private final Screen parent;

    public ModSettings (Screen parent) {
        super(Text.of("MicrocontrollerMC Controls"));
        this.parent = parent;
    }
    protected void init() {


        this.addDrawableChild(new ButtonWidget(this.width / 2 - 155, this.height / 6 + 12, 150, 20, Text.of("Configure Microcontrollers"), (button) -> {
            this.client.setScreen(new SelectDevice(this));
        }));

        this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, this.height / 6 + 168, 200, 20, ScreenTexts.DONE, (button) -> {
            this.client.setScreen(this.parent);
        }));
    }

    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        drawCenteredText(matrices, this.textRenderer, this.title, this.width / 2, 15, 16777215);
        super.render(matrices, mouseX, mouseY, delta);
    }
}