#!/usr/bin/env ruby

# Module: Run
# Description: Run the application.

require './app/Collector'
require './app/Loader'
require './app/Processor'
require './app/Analyzer'
require './app/Poster'
require './app/data/BoundingBoxes'
include Collector
include Loader
include Processor
include Analyzer
include Poster
include BoundingBoxes
