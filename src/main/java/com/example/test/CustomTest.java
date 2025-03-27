package com.example.test;

import net.fabricmc.fabric.api.gametest.v1.GameTest;
import net.minecraft.block.Blocks;
import net.minecraft.test.TestContext;

public class CustomTest {
    @GameTest(structure = "modid:customtest")
    public void test(TestContext context) {
//        context.forceScheduledTick(new BlockPos(2, 1, 2));
//        context.forceScheduledTick(new BlockPos(1, 1, 2));
//        context.forceScheduledTick(new BlockPos(3, 1, 2));
        context.pushButton(2, 1, 1);
//        context.forceRandomTick(new BlockPos(2, 1, 1));
//        context.forceRandomTick(new BlockPos(2, 1, 2));
//        context.forceRandomTick(new BlockPos(3, 1, 2));
//        context.forceScheduledTick(new BlockPos(2, 1, 2));
//        context.forceScheduledTick(new BlockPos(1, 1, 2));
//        context.forceScheduledTick(new BlockPos(3, 1, 2));
//        context.runAtTick(20, () -> context.expectBlockAtEnd(Blocks.SLIME_BLOCK, 3, 1, 2));
        context.expectBlockAtEnd(Blocks.SLIME_BLOCK, 3, 1, 2);
//        context.runAtEveryTick(() -> context.expectBlock(Blocks.FIRE, 3, 1, 2));
//        context.complete();
//        context.pressButton(2, 1, 1);
//        context.assertBlockPresent(net.minecraft.world.level.block.Blocks.FIRE, 3, 1, 2);
//        context.succeed();
        context.complete();
    }
}
