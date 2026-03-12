package data.clonedProject;
import java.io.FileWriter;
class PixelColorMixer {
private static void writeDataToFile(String data, String path, boolean append) {
try {
FileWriter writer = new FileWriter(path, append);
writer.write(data);
writer.close();
} catch (Exception e) {
e.printStackTrace();
}
}
private static boolean mark(String statement, boolean isTrueCondition, boolean isFalseCondition, int id) {
StringBuilder markResult = new StringBuilder();
markResult.append(statement).append("===");
markResult.append(isTrueCondition).append("===");
markResult.append(isFalseCondition).append("===");
markResult.append(id).append("---end---");
writeDataToFile(markResult.toString(), "src/main/java/data/testDriverData/runTestDriverData.txt", true);
if (!isTrueCondition && !isFalseCondition) return true;
return !isFalseCondition;
}
private static int MAX_RECURSION_DEPTH = 1;
private PixelColorMixer(){
}
public static int mixColors(int color1, int color2, boolean emphasizeRed) {
if (MAX_RECURSION_DEPTH <= 0) {
System.out.println("Recursion depth exceeded. Returning default value.");
return 0;
}
MAX_RECURSION_DEPTH--;
{
mark("int a1=(color1 >>> 24) & 0xFF;\n", false, false, 2);
int a1=(color1 >>> 24) & 0xFF;
mark("int r1=(color1 >>> 16) & 0xFF;\n", false, false, 3);
int r1=(color1 >>> 16) & 0xFF;
mark("int g1=(color1 >>> 8) & 0xFF;\n", false, false, 4);
int g1=(color1 >>> 8) & 0xFF;
mark("int b1=(color1) & 0xFF;\n", false, false, 5);
int b1=(color1) & 0xFF;
mark("int a2=(color2 >>> 24) & 0xFF;\n", false, false, 7);
int a2=(color2 >>> 24) & 0xFF;
mark("int r2=(color2 >>> 16) & 0xFF;\n", false, false, 8);
int r2=(color2 >>> 16) & 0xFF;
mark("int g2=(color2 >>> 8) & 0xFF;\n", false, false, 9);
int g2=(color2 >>> 8) & 0xFF;
mark("int b2=(color2) & 0xFF;\n", false, false, 10);
int b2=(color2) & 0xFF;
mark("int a=(a1 + a2) >>> 1;\n", false, false, 13);
int a=(a1 + a2) >>> 1;
mark("int r=(r1 + r2) >>> 1;\n", false, false, 14);
int r=(r1 + r2) >>> 1;
mark("int g=(g1 + g2) >>> 1;\n", false, false, 15);
int g=(g1 + g2) >>> 1;
mark("int b=(b1 + b2) >>> 1;\n", false, false, 16);
int b=(b1 + b2) >>> 1;
if (((emphasizeRed) && mark("emphasizeRed", true, false, 19)) || mark("emphasizeRed", false, true, 19))
{
{
mark("r=Math.min(r | 0x20,0xFF);\n", false, false, 21);
r=Math.min(r | 0x20,0xFF);
mark("g=g & 0xF0;\n", false, false, 22);
g=g & 0xF0;
}
}
else {
{
mark("g=Math.min(g | 0x30,0xFF);\n", false, false, 25);
g=Math.min(g | 0x30,0xFF);
mark("r=r & 0xE0;\n", false, false, 26);
r=r & 0xE0;
}
}
mark("int brightness=(r + g + b) / 3;\n", false, false, 30);
int brightness=(r + g + b) / 3;
if (((brightness < 128) && mark("brightness < 128", true, false, 31)) || mark("brightness < 128", false, true, 31))
{
{
mark("r=Math.min(r + 0x20,0xFF);\n", false, false, 32);
r=Math.min(r + 0x20,0xFF);
mark("g=Math.min(g + 0x20,0xFF);\n", false, false, 33);
g=Math.min(g + 0x20,0xFF);
mark("b=Math.min(b + 0x20,0xFF);\n", false, false, 34);
b=Math.min(b + 0x20,0xFF);
}
}
else {
if (((brightness > 200) && mark("brightness > 200", true, false, 35)) || mark("brightness > 200", false, true, 35))
{
{
mark("r=r ^ 0x10;\n", false, false, 37);
r=r ^ 0x10;
mark("g=g ^ 0x10;\n", false, false, 38);
g=g ^ 0x10;
mark("b=b ^ 0x10;\n", false, false, 39);
b=b ^ 0x10;
}
}
}
mark("return ((a & 0xFF) << 24) | ((r & 0xFF) << 16) | ((g & 0xFF) << 8)| (b & 0xFF);\n", false, false, 43);
return ((a & 0xFF) << 24) | ((r & 0xFF) << 16) | ((g & 0xFF) << 8)| (b & 0xFF);
}

}
public static final int intmixColorsintcolor1intcolor2booleanemphasizeRedTotalStatement = 27;
public static final int intmixColorsintcolor1intcolor2booleanemphasizeRedTotalBranch = 6;
public static final int PixelColorMixerTotalStatement = 27;
}
