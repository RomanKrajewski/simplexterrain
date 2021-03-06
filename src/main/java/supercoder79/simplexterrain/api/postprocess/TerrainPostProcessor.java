package supercoder79.simplexterrain.api.postprocess;

import java.util.Random;

import net.minecraft.world.WorldAccess;
import supercoder79.simplexterrain.api.Heightmap;

public interface TerrainPostProcessor {
	/**
	 * This function executes on creation of the chunk generator and is useful for setting up noise functions and randoms.
	 *
	 * @param seed the seed used to initialize noise functions and randoms.
	 */
	void init(long seed);

	/**
	 * This function executes during setup time, and is useful for configs.
	 */
	void setup();

	/**
	 * This function executes for every chunk being generated.
	 */
	void process(WorldAccess world, Random rand, int chunkX, int chunkZ, Heightmap heightmap);

	/**
	 * Returns the specified time for the post processor to be run.
	 */
	default PostProcessorTarget getTarget() {
		return PostProcessorTarget.FEATURES;
	}
}
