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

package app

import app.data._

/**
 * Class: Main
 * Description: Run the application.
 */

object Main {
    
    def main(args: Array[String]) {
    }

    val json_file = "Obama"
    val tweets = Loader.load(json_file)

    val en_lang_tweets = Processor.get_en_lang(tweets)
    val en_user_lang_tweets = Processor.get_en_user_lang(tweets)
    val raw_text = Processor.get_raw_text(tweets)
    val en_lang_raw_text = Processor.get_en_lang_raw_text(tweets)
    val en_user_lang_raw_text = Processor.get_en_user_lang_raw_text(tweets)

    val delimited_raw_text = Processor.delimit_text(tweets)
    val processed_text = Processor.process(tweets)

    val num_of_char = Analyzer.number_of_characters(raw_text)
    val total_num_of_char = Analyzer.total_number_of_characters(raw_text)
    val max_num_of_char = Analyzer.maximum_number_of_characters(raw_text)
    val min_num_of_char = Analyzer.minimum_number_of_characters(raw_text)
    val mean_num_of_char = Analyzer.mean_number_of_characters(raw_text)
    val med_num_of_char = Analyzer.median_number_of_characters(raw_text)
    val mode_num_of_char = Analyzer.mode_number_of_characters(raw_text)

    val character_statistics = Analyzer.character_analysis(raw_text)

    val top_5_processed_text = Analyzer.top_words(5, processed_text)
    val top_5_delimited_raw_text = Analyzer.top_words(5, delimited_raw_text)

    println()
    println("FILENAME: " + json_file)
    println()
    print("RAW TEXT: ")
    println(raw_text)
    println()
    print("CHARACTER STATISTICS: ")
    println(character_statistics)
    println()
    print("PROCESSED TEXT: ")
    println(processed_text)
    println()
    print("TOP 5 PROCESSED TEXT: ")
    println(top_5_processed_text)
    println()

}
