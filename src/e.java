public class e {
    

    public String ee(byte[] bArr) {
        return ee(bArr, 0, bArr.length);
    }

    public String ee(byte[] bArr, int i, int i2) {
        char[] ee = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr = new char[(i2 * 2)];
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            byte b = bArr[i4];
            int i5 = i3 + 1;
            cArr[i3] = ee[(b >>> 4) & 15];
            i3 = i5 + 1;
            cArr[i5] = ee[b & 15];
        }
        return new String(cArr);
    }

    private int ee(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 65) + 10;
        }
        if (c < 'a' || c > 'f') {
            return 0;
        }
        return (c - 97) + 10;
    }
    
}