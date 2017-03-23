package net.sourceforge.lept4j;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : ptra.h:5</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class L_Ptra extends Structure {
	/**
	 * size of allocated ptr array<br>
	 * C type : l_int32
	 */
	public int nalloc;
	/**
	 * greatest valid index<br>
	 * C type : l_int32
	 */
	public int imax;
	/**
	 * actual number of stored elements<br>
	 * C type : l_int32
	 */
	public int nactual;
	/**
	 * ptr array<br>
	 * C type : void**
	 */
	public PointerByReference array;
	public L_Ptra() {
		super();
	}
	protected List<? > getFieldOrder() {
		return Arrays.asList("nalloc", "imax", "nactual", "array");
	}
	/**
	 * @param nalloc size of allocated ptr array<br>
	 * C type : l_int32<br>
	 * @param imax greatest valid index<br>
	 * C type : l_int32<br>
	 * @param nactual actual number of stored elements<br>
	 * C type : l_int32<br>
	 * @param array ptr array<br>
	 * C type : void**
	 */
	public L_Ptra(int nalloc, int imax, int nactual, PointerByReference array) {
		super();
		this.nalloc = nalloc;
		this.imax = imax;
		this.nactual = nactual;
		this.array = array;
	}
	public L_Ptra(Pointer peer) {
		super(peer);
		read();
	}
	public static class ByReference extends L_Ptra implements Structure.ByReference {
		
	};
	public static class ByValue extends L_Ptra implements Structure.ByValue {
		
	};
}
