package jodd;

/**
 * Jodd!
 */
public class Jodd {

	static {
		joddBeanLoaded = checkModule("bean");
		joddHttpLoaded = checkModule("http");
		joddMadvocLoaded = checkModule("madvoc");
		joddMailLoaded = checkModule("mail");
		joddPetiteLoaded = checkModule("petite");
		joddPropsLoaded = checkModule("props");
		joddProxettaLoaded = checkModule("proxetta");
		joddServletLoaded = checkModule("servlet");
		joddUploadLoaded = checkModule("upload");
		joddVtorLoaded = checkModule("vtor");
	}

	/**
	 * Checks if some Jodd module is loaded.
	 */
	private static boolean checkModule(String moduleName) {
		ClassLoader classLoader = Jodd.class.getClassLoader();

		moduleName = moduleName.substring(0, 1).toUpperCase() +
				moduleName.substring(1, moduleName.length()).toLowerCase();

		try {
			classLoader.loadClass("jodd.Jodd" + moduleName);
			return true;
		} catch (ClassNotFoundException cnfex) {
			return false;
		}
	}

	private static final boolean joddBeanLoaded;
	private static final boolean joddHttpLoaded;
	private static final boolean joddMadvocLoaded;
	private static final boolean joddMailLoaded;
	private static final boolean joddPetiteLoaded;
	private static final boolean joddPropsLoaded;
	private static final boolean joddProxettaLoaded;
	private static final boolean joddServletLoaded;
	private static final boolean joddUploadLoaded;
	private static final boolean joddVtorLoaded;

	// ---------------------------------------------------------------- getters


	public static boolean isJoddBeanLoaded() {
		return joddBeanLoaded;
	}

	public static boolean isJoddHttpLoaded() {
		return joddHttpLoaded;
	}

	public static boolean isJoddMadvocLoaded() {
		return joddMadvocLoaded;
	}

	public static boolean isJoddMailLoaded() {
		return joddMailLoaded;
	}

	public static boolean isJoddPetiteLoaded() {
		return joddPetiteLoaded;
	}

	public static boolean isJoddPropsLoaded() {
		return joddPropsLoaded;
	}

	public static boolean isJoddProxettaLoaded() {
		return joddProxettaLoaded;
	}

	public static boolean isJoddServletLoaded() {
		return joddServletLoaded;
	}

	public static boolean isJoddUploadLoaded() {
		return joddUploadLoaded;
	}

	public static boolean isJoddVtorLoaded() {
		return joddVtorLoaded;
	}

}