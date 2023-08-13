package screens.search.search

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import moe.tlaster.precompose.navigation.Navigator
import screens.components.search.SearchItem
import theme.Primary
import theme.Tranparent
import theme.regular14LightGray


@Composable
fun SearchScreen(
    navigator: Navigator
) {
    var search by remember { mutableStateOf("") }

//    Column (modifier = Modifier.fillMaxSize().padding(top = 35.dp)) {
        Column (modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.padding(horizontal = 30.dp).padding(top = 39.dp)) {
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

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(10.dp),
                modifier = Modifier.fillMaxSize()
            ) {
                items(5) {
                    SearchItem()
                }
            }
        }

}
