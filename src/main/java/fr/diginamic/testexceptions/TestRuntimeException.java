package fr.diginamic.testexceptions;

/**
 * @author antoinethebault
 *TestRuntimeException : classe executable testant les exceptions
 */
public class TestRuntimeException {

	public static void main(String[] args){
			System.out.println(Operation.diviserRuntime(6, 3));
			System.out.println(Operation.diviserRuntime(6, 0));

	}

}
