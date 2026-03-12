package core.output.clone;
import static core.TestGeneration.path.MarkedPath.markOneStatement;
public class binaryGcd {
public static int binaryGcd(int u, int v) {
{
markOneStatement("int uMask=u >> 31;\n", false, false, 83);
int uMask=u >> 31;
markOneStatement("u=(u ^ uMask) - uMask;\n", false, false, 113);
u=(u ^ uMask) - uMask;
markOneStatement("int vMask=v >> 31;\n", false, false, 149);
int vMask=v >> 31;
markOneStatement("v=(v ^ vMask) - vMask;\n", false, false, 179);
v=(v ^ vMask) - vMask;
if (((u == 0) && markOneStatement("u == 0", true, false, 219)) || markOneStatement("u == 0", false, true, 219))
{
{
markOneStatement("return v;\n", false, false, 242);
return v;
}
}
if (((v == 0) && markOneStatement("v == 0", true, false, 276)) || markOneStatement("v == 0", false, true, 276))
{
{
markOneStatement("return u;\n", false, false, 299);
return u;
}
}
markOneStatement("int shift=0;\n", false, false, 331);
int shift=0;
while (((((u | v) & 1) == 0) && markOneStatement("((u | v) & 1) == 0", true, false, 362)) || markOneStatement("((u | v) & 1) == 0", false, true, 362)) {
{
markOneStatement("u=u >> 1;\n", false, false, 397);
u=u >> 1;
markOneStatement("v=v >> 1;\n", false, false, 422);
v=v >> 1;
markOneStatement("shift=shift + 1;\n", false, false, 447);
shift=shift + 1;
}
}
while ((((u & 1) == 0) && markOneStatement("(u & 1) == 0", true, false, 495)) || markOneStatement("(u & 1) == 0", false, true, 495)) {
{
markOneStatement("u=u >> 1;\n", false, false, 524);
u=u >> 1;
}
}
while (((v != 0) && markOneStatement("v != 0", true, false, 565)) || markOneStatement("v != 0", false, true, 565)) {
{
while ((((v & 1) == 0) && markOneStatement("(v & 1) == 0", true, false, 595)) || markOneStatement("(v & 1) == 0", false, true, 595)) {
{
markOneStatement("v=v >> 1;\n", false, false, 628);
v=v >> 1;
}
}
if (((u > v) && markOneStatement("u > v", true, false, 674)) || markOneStatement("u > v", false, true, 674))
{
{
markOneStatement("int temp=u;\n", false, false, 700);
int temp=u;
markOneStatement("u=v;\n", false, false, 731);
u=v;
markOneStatement("v=temp;\n", false, false, 755);
v=temp;
}
}
markOneStatement("v=v - u;\n", false, false, 795);
v=v - u;
}
}
markOneStatement("return u << shift;\n", false, false, 828);
return u << shift;
}

}
public static final int binaryGcdTotalStatement = 24;
}
