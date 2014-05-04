/**
 * Copyright 2014 Tweetalytics, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package app.data

import app.BoundingBox

/**
 * Class: BoundingBoxes
 * Description: This singleton object contains a list of bounding boxes.
 */

object BoundingBoxes {

    val World = new BoundingBox(-90.0, -180.0, 90.0, 180.0)
    val United_States = new BoundingBox(25.165173, -123.587952, 48.980217, -66.810608)
    val Southern_California = new BoundingBox(32.509762, -120.021515, 34.998504, -116.494389)
    val Northern_California = new BoundingBox(36.004673, -124.476814, 42.004407, -119.999027)
    val New_England = new BoundingBox(41.000241, -73.500279, 45.000394, -67.000112)
    val New_York_City = new BoundingBox(40.498137, -74.248567, 40.876141, -73.756928)
    val Los_Angeles = new BoundingBox(33.70035, -119.113984, 34.330962, -117.989259)
    val Chicago = new BoundingBox(41.681118, -87.880497, 42.028894, -87.506962)
    val Dallas = new BoundingBox(32.676373, -96.925721, 32.924555, -96.678529)
    val Houston = new BoundingBox(29.548372, -95.748811, 30.107118, -95.107484)
    val Philadelphia = new BoundingBox(39.882343, -75.268922, 40.132691, -74.966798)
    val Washington_DC = new BoundingBox(38.827138, -77.119653, 38.99554, -76.909645)
    val Miami = new BoundingBox(25.177602, -80.854311, 25.971626, -80.118012)
    val Atlanta = new BoundingBox(33.65378, -84.547745, 33.880962, -84.28888)
    val Boston = new BoundingBox(42.233983, -71.189716, 42.384923, -70.98787)
    val San_Francisco = new BoundingBox(37.707998, -122.505852, 37.833107, -122.358223)

}
