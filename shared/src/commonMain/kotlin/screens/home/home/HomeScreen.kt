package screens.home.home

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import screens.components.home.MovieItem
import screens.components.home.NowPlayingItem
import theme.*


@Composable
fun HomeScreen(
    navigator: Navigator
) {
    var search by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()) {
       LazyColumn(modifier = Modifier.padding(top = 20.dp).fillMaxSize()){
           // Search
           item {
                Column(modifier = Modifier.padding(horizontal = 30.dp)) {
                    TextField(
                        modifier = Modifier.fillMaxWidth().border(2.dp, MaterialTheme.colors.secondary, shape = RoundedCornerShape(20.dp)),
                        value = search,
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = MaterialTheme.colors.background,
                            cursorColor = MaterialTheme.colors.secondary,
                            focusedIndicatorColor = Tranparent,
                            unfocusedIndicatorColor = Tranparent,
                        ),
                        onValueChange = {
                            search = it
                        },
                        singleLine = true,
                        trailingIcon = {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = "search",
                                tint = Primary
                            )
                        },
                        placeholder = {
                            Text(
                                "Search your Movies...",
                                style = MaterialTheme.typography.regular14LightGray,
                            )
                        }
                    )

                }
           }

           // Now playing
           item {
               Column {
                   Text(
                       "Now Playing",
                       style = MaterialTheme.typography.semiBold20,
                       modifier = Modifier
                           .padding(top = 40.dp, bottom = 20.dp, start =  20.dp)
                   )

                   LazyRow {
                       item{
                           Spacer(modifier = Modifier.width(20.dp))
                           NowPlayingItem(navigator)
                           Spacer(modifier = Modifier.width(20.dp))
                       }
                       item{
                           NowPlayingItem(navigator)
                       }
                   }
               }
           }

           // Popular
           item {
               Column {
                   Text(
                       "Popular",
                       style = MaterialTheme.typography.semiBold20,
                       modifier = Modifier
                           .padding(top = 40.dp, bottom = 20.dp, start =  20.dp)
                   )

                   LazyRow {
                       item {
                           Spacer(modifier = Modifier.width(20.dp))
                           MovieItem()
                       }
                   }
               }
           }

           item {
               Column {
                   Text(
                       "Popular",
                       style = MaterialTheme.typography.semiBold20,
                       modifier = Modifier
                           .padding(top = 40.dp, bottom = 20.dp, start =  20.dp)
                   )

                   LazyRow {
                       item {
                           Spacer(modifier = Modifier.width(20.dp))
                           MovieItem()
                       }
                   }
               }
           }
       }
    }
}