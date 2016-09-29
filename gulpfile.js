var gulp = require("gulp");
var sourcemaps = require("gulp-sourcemaps");
var babel = require("gulp-babel");
var concat = require("gulp-concat");

var REACT_DIST_PATH = 'react-15.3.2/build/';

gulp.task("default", function () {
  return gulp
    .src([REACT_DIST_PATH + 'react.min.js', REACT_DIST_PATH + 'react-dom.min.js', REACT_DIST_PATH + 'react-dom-server.min.js', 'src/main/jsx/**/*.jsx'])
    .pipe(sourcemaps.init())
    .pipe(babel())
    .pipe(concat("app.js"))
    .pipe(sourcemaps.write("."))
    .pipe(gulp.dest("src/main/resources/webroot"));
});
