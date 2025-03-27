package com.example.test;

import net.fabricmc.fabric.api.gametest.v1.GameTest;
import net.minecraft.gametest.framework.GameTestHelper;
import net.minecraft.world.level.block.Blocks;

public class CustomTest {
    @GameTest(structure = "modid:customtest")
    public void test(GameTestHelper context) {
        // Press the button
        context.pressButton(2, 1, 1);

        // Succeed when we get a slime block. This should be a fail - the dispenser should send out a fire block
        context.succeedWhenBlockPresent(Blocks.SLIME_BLOCK, 3, 1, 2);

        // Regular "succeed". Possibly this is called before the previous command runs, so this causes the test to pass when it shouldn't.
        context.succeed();
    }
}
