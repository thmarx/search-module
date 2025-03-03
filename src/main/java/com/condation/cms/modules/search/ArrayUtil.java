package com.condation.cms.modules.search;

/**
 *
 * @author thmar
 */
public class ArrayUtil {

	private static float[] EMPTY_FLOAT_ARRAY = new float[0];

	public static float[] toPrimitive(final Float[] array) {
		if (array == null) {
			return null;
		}
		if (array.length == 0) {
			return EMPTY_FLOAT_ARRAY;
		}
		final float[] result = new float[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i].floatValue();
		}
		return result;
	}
}
