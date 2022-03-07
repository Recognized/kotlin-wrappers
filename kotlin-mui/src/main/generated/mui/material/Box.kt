// Automatically generated - do not modify!

@file:JsModule("@mui/material/Box")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface BoxProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
    override var children: react.ReactNode?

    override var component: react.ElementType<*>?

    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Box](https://mui.com/components/box/)
 *
 * API:
 *
 * - [Box API](https://mui.com/components/box/#api)
 * NOTE - As a CSS utility component, Box also supports all system props.
 * You can use them as props directly on the component.
 * Props use same syntax as `sx`. Not all props are listed in the API section.
 *
 * Example:
 *
 * // For instance, a Box with margin-top:
 * <Box mt={2}>
 */
@JsName("default")
external val Box: react.FC<BoxProps>
