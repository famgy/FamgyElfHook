
add_library( # Sets the name of the library.
             xhookapply

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             xhookapply.c )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
                       xhookapply

                       # Links the target library to the log library
                       # included in the NDK.
                       xhook
                       log )