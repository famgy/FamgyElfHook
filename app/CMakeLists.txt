# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

#set(CMAKE_BUILD_TYPE RELEASE)

#set(CMAKE_C_FLAGS "-O2 ${CMAKE_C_FLAGS}")

string(REPLACE "-O0" "-O2" CMAKE_C_FLAGS ${CMAKE_C_FLAGS})

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

# CmakeList.txt in other directories
add_subdirectory(src/main/jni/xhooktest)