public class AndroidCompiler extends CrossCompiler {
    protected void collectSource() {
        //anything specific to this class
        System.out.println("AndroidCompiler collectSource ......... ");
    }

    protected void compileToTarget() {
        //android specific compilation
        System.out.println("AndroidCompiler compileToTarget ......... ");
    }
}