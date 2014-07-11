/*
 ** 2014 July 10
 **
 ** The author disclaims copyright to this source code.  In place of
 ** a legal notice, here is a blessing:
 **    May you do good and not evil.
 **    May you find forgiveness for yourself and forgive others.
 **    May you share freely, never taking more than you give.
 */
package info.ata4.unity.engine;

import info.ata4.unity.serdes.UnityObject;

// StreamInfo data
//   unsigned int channelMask
//   unsigned int offset
//   UInt8 stride
//   UInt8 dividerOp
//   UInt16 frequency
public class StreamInfo {
    
    public final Long channelMask;
    public final Long offset;
    public final Long stride;
    public final Long dividerOp;
    public final Long frequency;
    public final Long align;

    StreamInfo(UnityObject obj) {
        channelMask = obj.getValue("channelMask");
        offset = obj.getValue("offset");
        stride = obj.getValue("stride");
        dividerOp = obj.getValue("dividerOp");
        frequency = obj.getValue("frequency");
        align = obj.getValue("align");
    }
    
}
