public class IPhoneCompiler extends CrossCompiler {
  protected void collectSource() {
    //anything specific to this class
    System.out.println("IPhoneCompiler collectSource ......... ");
  }
  protected void compileToTarget() {
    //iphone specific compilation
    System.out.println("IPhoneCompiler compileToTarget ......... ");
  }
}