#!/usr/bin/env ruby

Real_Remove_Urls_Output = [
[
"",
"Hello",
"Hello",
"Hello",
"Hello Hello",
"Hello Hello",
"Hello Hello",
"Hello Hello Hello"
],
["",
"Hello",
"Hello",
"Hello",
"Hello",
"Hello Hello",
"Hello Hello",
"Hello Hello",
"Hello Hello",
"Hello Hello",
"Hello Hello",
"Hello Hello Hello",
"Hello Hello Hello",
"Hello Hello Hello",
"Hello Hello Hello",
"Hello Hello Hello Hello"
]
]

Extract_Words_Input = [
'hello hello. #hello',
'hello hello.....hello',
"hello! we're so hello, & hello!",
'# 1 hello in twitter #hello #hello :)'
]

Real_Extract_Words_Output = [
['hello', 'hello', 'hello'],
['hello', 'hello', 'hello'],
['hello', "we're", 'so', 'hello', 'hello'],
['hello', 'in', 'twitter', 'hello', 'hello']
]
