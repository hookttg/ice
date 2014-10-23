// **********************************************************************
//
// Copyright (c) 2003-2014 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************

package IceUtil;

/**
 * @deprecated IceUtil.Version is deprecated, use Ice.Util.stringVersion() or
 * Ice.Util.intVersion() instead.
 **/
@Deprecated
public final class Version
{
    //
    // The Ice version.
    //
    public final static String ICE_STRING_VERSION = "3.6b"; // "A.B.C", with A=major, B=minor, C=patch
    public final static int ICE_INT_VERSION = 30651;         // AABBCC, with AA=major, BB=minor, CC=patch
}