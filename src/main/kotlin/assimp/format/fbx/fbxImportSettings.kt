/*
Open Asset Import Library (assimp)
----------------------------------------------------------------------

Copyright (c) 2006-2017, assimp team

All rights reserved.

Redistribution and use of this software in source and binary forms,
with or without modification, are permitted provided that the
following conditions are met:

* Redistributions of source code must retain the above
  copyright notice, this list of conditions and the
  following disclaimer.

* Redistributions in binary form must reproduce the above
  copyright notice, this list of conditions and the
  following disclaimer in the documentation and/or other
  materials provided with the distribution.

* Neither the name of the assimp team, nor the names of its
  contributors may be used to endorse or promote products
  derived from this software without specific prior
  written permission of the assimp team.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

----------------------------------------------------------------------
*/

package assimp.format.fbx

/** @file  FBXImportSettings.h
 *  @brief FBX importer runtime configuration
 */

/** FBX import settings, parts of which are publicly accessible via their corresponding AI_CONFIG constants */
object ImportSettings {

    /** Enable strict mode:
     *   - only accept fbx 2012, 2013 files
     *   - on the slightest error, give up.
     *
     *  Basically, strict mode means that the fbx file will actually be validated. Strict mode is off by default. */
    var strictMode = true

    /** Specifies whether all geometry layers are read and scanned for usable data channels. The FBX spec indicates that
     *  many readers will only read the first channel and that this is in some way the recommended way- in reality,
     *  however, it happens a lot that vertex data is spread among multiple layers. The default value for this option is
     *  true.*/
    var readAllLayers = true

    /** Specifies whether all materials are read, or only those that are referenced by at least one mesh. Reading all
     *  materials may make FBX reading a lot slower since all objects need to be processed .
     *  This bit is ignored unless readMaterials=true */
    var readAllMaterials = false

    /** Import materials (true) or skip them and assign a default material. The default value is true.*/
    var readMaterials = true

    /** Import embedded textures? Default value is true.*/
    var readTextures = true

    /** Import cameras? Default value is true.*/
    var readCameras = true

    /** Import light sources? Default value is true.*/
    var readLights = true

    /** Import animations (i.e. animation curves, the node skeleton is always imported). Default value is true. */
    var readAnimations = true

    /** Read bones (vertex weights and deform info). Default value is true. */
    var readWeights = true

    /** Preserve transformation pivots and offsets. Since these can not directly be represented in assimp, additional
     *  dummy nodes will be generated. Note that settings this to false can make animation import a lot slower.
     *  The default value is true.
     *
     *  The naming scheme for the generated nodes is:
     *    <OriginalName>_$AssimpFbx$_<TransformName>
     *
     *  where <TransformName> is one of
     *    RotationPivot
     *    RotationOffset
     *    PreRotation
     *    PostRotation
     *    ScalingPivot
     *    ScalingOffset
     *    Translation
     *    Scaling
     *    Rotation     **/
    var preservePivots = true

    /** Do not import animation curves that specify a constant values matching the corresponding node transformation.
     *  The default value is true. */
    var optimizeEmptyAnimationCurves = true

    /** search for embedded loaded textures, where no embedded texture data is provided. The default value is false. */
    var searchEmbeddedTextures = false
}

